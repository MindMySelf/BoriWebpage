import { Routes, Route } from "react-router-dom";
import { Container } from "react-bootstrap";
import { Home } from "../pages/Home";
import { ClientProfile } from "../pages/ClientProfile";
import { Pages } from "../pages/Pages";
import { Navbar } from "../components/Navbar";
import { Templates } from "../pages/Templates";

function App() {
  return (
    <>
      <Navbar />
      <Container className="mb-4">
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/client" element={<ClientProfile />} />
          <Route path="/pages" element={<Pages />} />
          <Route path="/templates" element={<Templates />} />
        </Routes>
      </Container>
    </>
  );
}

export default App;
