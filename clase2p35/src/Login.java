public class Login {
    String clave;
    String usuario;
    public Login(String usuario, String clave){
        this.clave = clave;
        this.usuario = usuario;
    }
    public Login(String usuario){
        this.usuario = usuario;
        this.clave = String.valueOf((int)Math.floor(Math.random()*1000));
    }
    public void mostrardatos(){
        System.out.println("Nombre de usuario: " +this.usuario+ " y contraseña: "+this.clave);
    }
    
}
