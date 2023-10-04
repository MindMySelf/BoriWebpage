import { useParams } from "react-router-dom"
import { useState, useEffect } from "react";
import { Spinner } from "react-bootstrap";
import { Client } from "../data/Client";
import { ClientProfile } from "../components/ClientProfile";

async function fetchClientData(id:string) {
    return await fetch(`/api/v1/clients/${id}`).then((res) => res.json() as Promise<Client>);
}

export function ClientProfilePage() {
    const { id } = useParams();
    const [client, setClient] = useState<Client | null>(null);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        fetchClientData(id!)
        .then((client) => {
            setClient(client);
            setLoading(false);
        })
        .catch((err) => {
            throw err;
        })
    }, [id]);

    if(loading) {
        return (
            <Spinner animation="border" role="status" className="d-flex justify-content-center">
              <span className="visually-hidden">Loading...</span>
            </Spinner>
          );
    }

    return <ClientProfile name=""></ClientProfile>
}