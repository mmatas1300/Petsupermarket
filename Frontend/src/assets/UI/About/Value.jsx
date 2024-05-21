export const Value = ({img, name, children, cols}) => {
    return (
        <div className={cols}>
            <img src={`/icons/${img}.svg`} alt={name} width="50" height="50" />
            <h2>{name}</h2>
            <p>{children}</p>
        </div>
    );
}