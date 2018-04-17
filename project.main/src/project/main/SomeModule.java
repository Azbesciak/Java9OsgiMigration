package project.main;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		service = {SomeModule.class}
)
public class SomeModule {
	
	public void hello() {
		System.out.printf("Hello Jetbrains - injected Int: %d\n", 2);
	}
}
