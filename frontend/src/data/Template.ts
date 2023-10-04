import { UUID } from "crypto";

export type Template = {
    id:UUID;
    title:string;
    html:string;
}