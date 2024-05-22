import { Star as StarIcon } from 'lucide-react';

export const Stars = ({num})=>{

    const stars = ()=>{
        const starsArray = [];
        for (let i = 0; i < num; i++) {
            starsArray.push(<StarIcon color='#008f7a' size={16}/>)
        }
        return starsArray;
    };

    return (
        <div>
            {stars().map((star)=>{return star})}
        </div>
    );
}