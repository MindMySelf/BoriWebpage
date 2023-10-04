import { UUID } from "crypto";
import { Template } from "./Template";

export type Page = {
    id: UUID;
    title: string;
    template:Template
    
}