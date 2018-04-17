package project.main;

import org.osgi.service.component.annotations.Component;
import static org.apache.felix.service.command.CommandProcessor.COMMAND_FUNCTION;
import static org.apache.felix.service.command.CommandProcessor.COMMAND_SCOPE;

@Component(
		immediate = true,
		service = {SomeModule.class},
		property = {
				COMMAND_SCOPE + "=com",
				COMMAND_FUNCTION + "=hello",
		}
)
public class SomeModule {
	
	public void hello() {
		System.out.printf("Hello Jetbrains - injected Int: %d\n", 2);
	}
}
