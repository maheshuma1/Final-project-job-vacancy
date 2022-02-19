package builder;

public class JobBuilder {
	String name;
	String description;
	String level;

	public JobBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public JobBuilder setDescription(String description) {
		this.description = description;
		return this;
	}

	public JobBuilder setLevel(String level) {
		this.level = level;
		return this;
	}
}