import { Routes, Route } from "react-router-dom";
import { Home } from "../pages/Home";
import { ClientProfilePage } from "../pages/ClientProfilePage";
import { Pages } from "../pages/Pages";
import { Navbar } from "../components/Navbar";
import { Templates } from "../pages/Templates";
import "../index.css"

function App() {
  return (
    <>
      <Navbar />      
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/client" element={<ClientProfilePage />} />
          <Route path="/pages" element={<Pages />} />
          <Route path="/templates" element={<Templates />} />
        </Routes>
    </>
  );
}

export default App;
