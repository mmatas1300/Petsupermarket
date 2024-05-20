import {BrowserRouter, Routes, Route} from "react-router-dom";
import Navbar from "./assets/Components/Navbar";
import Home from "./assets/Pages/Home";
import Products from "./assets/Pages/Products";
import About from "./assets/Pages/About";
import Contact from "./assets/Pages/Contact";

export default function App() {
    return (
        <BrowserRouter>
            <Navbar/>
            <Routes>
                <Route path="/" element={<Home/>}/>
                <Route path="/productos" element={<Products/>}/>
                <Route path="/contacto" element={<Contact/>}/>
                <Route path="/nosotros" element={<About/>}/>
            </Routes>
        </BrowserRouter>
    );
}