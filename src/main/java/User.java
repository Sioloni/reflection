public class User {
    private Long id;
    @Substitute(index = '|', sim = 'e')
    private String fio;
    private String email;


    public User(Long id, String fio, String email) {
        this.id = id;
        this.fio = fio;
        this.email = email;
    }

    public User() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
