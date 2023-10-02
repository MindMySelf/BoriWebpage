import { Routes, Route } from "react-router-dom";
import { Home } from "../pages/Home";
import { ClientProfile } from "../pages/ClientProfile";
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
          <Route path="/client" element={<ClientProfile />} />
          <Route path="/pages" element={<Pages />} />
          <Route path="/templates" element={<Templates />} />
        </Routes>
    </>
  );
}

export default App;
