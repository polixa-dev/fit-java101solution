package com.tasks5.command;
public class Application {
	public static void main(String[] args) {
		Command command = null;

		if (args != null) {
			if (args.length == 1) {
				if (args[0].equals("help")) command = new Help();
				else
				if (args[0].equals("exit")) command = new GoodBuy();
			} else
			if (args.length == 2) {
				if (args[0].equals("echo")) command = new Echo(args[1]);
				else
				if (args[0].equals("date") & args[1].equals("now")) command = new Date();
			}
		}

		if (command == null) command = new Echo("Error");

		command.execute();
	}
}

package com.tasks5.command;
public class Date implements Command {
	@Override
	public void execute() {
		System.out.println(System.currentTimeMillis());
	}
}

package com.tasks5.command;
public class Echo implements Command {
	private String text;

	public Echo(String text) {
		this.text = text;
	}

	@Override
	public void execute() {
		System.out.println(text);
	}
}

package com.tasks5.command;
public class GoodBuy implements Command {
	@Override
	public void execute() {
		System.out.println("Goodbye!");
	}
}

package com.tasks5.command;
public class Help implements Command {
	@Override
	public void execute() {
		System.out.println("Help executed");
	}
}
