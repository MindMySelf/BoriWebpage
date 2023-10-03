import { useParams } from "react-router-dom"
import { useState, useEffect } from "react";
import { Spinner } from "react-bootstrap";

async function fetchClientData(id:string) {
    return await fetch(`/api/v1/clients/${id}`).then((res) => res.json());
}

export function ClientProfile() {
    const { id } = useParams();
    const [client, setClient] = useState(null);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        fetchClientData(id)
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
            <Spinner animation="border" role="status">
              <span className="visually-hidden">Loading...</span>
            </Spinner>
          );
    }

    return <h1>Here is the User Profile!</h1>
}