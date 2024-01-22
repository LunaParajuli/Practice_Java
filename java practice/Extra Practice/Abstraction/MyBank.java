
interface MyBank
{
    void write();
    void read();
    //only declares
    
}

class SBIread implements MyBank
{
      //implementation part is written here.
  @Override
  public void write() {
    System.out.println("SBIread");
  }
  @Override
  public void read() {
    System.out.println("SBIread");
  }
}