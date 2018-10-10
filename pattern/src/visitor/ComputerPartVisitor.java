package visitor;

public interface ComputerPartVisitor {

	public void visit(Computer computer);
	public void visit(Mouse computer);
	public void visit(Keyboard computer);
	public void visit(Monitor computer);
}
