import { BrowserRouter, Routes, Route } from "react-router-dom";
import Navbar from "./assets/Components/Navbar";
import Home from "./assets/Pages/Home";
import Products from "./assets/Pages/Products";
import Product from "./assets/Pages/Product";
import About from "./assets/Pages/About";
import Contact from "./assets/Pages/Contact";
import Footer from "./assets/Components/Footer";
import Login from "./assets/Pages/Login";
import Signup from "./assets/Pages/Signup";
import Cart from "./assets/Pages/Cart";

export default function App() {
    return (
        <div className="d-flex flex-column min-vh-100">
            <BrowserRouter>
                <Navbar />
                <main className="flex-grow-1">
                    <Routes>
                        <Route path="/" element={<Home />} />
                        <Route path="/productos" element={<Products />} />
                        <Route path="/productos/:productId" element={<Product />} />
                        <Route path="/contacto" element={<Contact />} />
                        <Route path="/nosotros" element={<About />} />
                        <Route path="/login" element={<Login />} />
                        <Route path="/signup" element={<Signup />} />
                        <Route path="/bolsa" element={<Cart />} />
                    </Routes>
                </main>

                <Footer />
            </BrowserRouter>
        </div>
    );
}