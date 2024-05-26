import { CircleX as DeleteIcon} from 'lucide-react';

export default function Cart() {
    return (
        <div className="my-5 d-flex flex-column justify-content-center align-items-center">
            <h2>Bolsa de productos</h2>
            <div className="row bg-form p-2 text-center rounded mx-1">
                <div className="col-lg-2 col-2">
                    Eliminar
                </div>

                <div className="col-lg-4 col-5">
                    Producto
                </div>

                <div className="col-lg-2 d-none d-lg-block">
                    Precio
                </div>

                <div className="col-lg-2 d-none d-lg-block">
                    Cantidad
                </div>

                <div className="col-lg-2 col-5">
                    Subtotal
                </div>


                <>
                    <div className="col-lg-2 bg-list py-1 my-1 rounded-left col-2">
                        <DeleteIcon/>
                    </div>

                    <div className="col-lg-4 bg-list py-1 my-1 col-5">
                        Producto1
                    </div>

                    <div className="col-lg-2 bg-list py-1 my-1 d-none d-lg-block">
                        $200.00
                    </div>

                    <div className="col-lg-2 bg-list py-1 my-1 d-none d-lg-block">
                        2
                    </div>

                    <div className="col-lg-2 bg-list py-1 my-1 rounded-rigth col-5">
                        $400.00
                    </div>
                </>
            </div>

            <div className="opinion p-3 mt-2">
                <h2>Total: $2000</h2>
            </div>

            <button className="mt-2">Pagar</button>

        </div>
    );
}