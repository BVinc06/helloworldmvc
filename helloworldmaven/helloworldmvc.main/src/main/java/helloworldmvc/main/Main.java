package helloworldmvc.main;

import helloworldmvc.Contract.IView;
import helloworldmvc.controller.*;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class Main {
	public void main(final String[] args) {
		new Controller((IView) new View(), new Model()).run();
	}
}