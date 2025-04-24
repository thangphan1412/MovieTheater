
const user = {
    name: 'Hedy Lamarr',
    imageUrl: 'https://i.imgur.com/yXOvdOSs.jpg',
    imageSize: 90,
};
function Learn() {
    <div>
        <h1>{user.name}</h1>
        <img
            className="avater"
            src={user.imageUrl}
            alt={'photo' +user.name}
            style={{
                width: user.imageSizes,
                height: user.imageSizes
            }}
        />
    </div>
}
export default Learn;