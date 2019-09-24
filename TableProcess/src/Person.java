@Entity("people")
public class Person {
    @ID
    @Column(nullable=false, length = 0)
    private Integer id;
    @Column(nullable=false,length=16)
    private String name;
    public Integer getId(){
    	return id;
    }
    public void setId(Integer id) {
    	this.id=id;
    }
    public String getName() {
    	return name;
    }
    public void setNmae(String name) {
    	this.name=name;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
