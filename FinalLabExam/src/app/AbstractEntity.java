package app;

public abstract class AbstractEntity {
    private Long id;
    public AbstractEntity(){

    }
    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return id;
    }
}
