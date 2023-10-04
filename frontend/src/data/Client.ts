import { UUID } from "crypto";
import { Page } from "./Page";

export type Client = {
    id: UUID,
    name: string,
    email: string,
    pages: Page[]
};
