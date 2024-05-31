import { CircleAlert } from 'lucide-react';

export const FormAlert = ({children}) => {
    return (
    <div className="col-12 d-flex align-items-center justify-content-center mt-3">
        <CircleAlert />
        <div className='mx-2'>
            {children}
        </div>
    </div>
    );
}