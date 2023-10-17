package mini_project;

public class Transportation 
{
	 private String type;
	 private String description;

	    public Transportation(String type, String description) {
	        this.type = type;
	        this.description = description;
	    }

	    public String getType() {
	        return type;
	    }

	    public String getDescription() {
	        return description;
	    }

		@Override
		public String toString() {
			return "Transportation [type=" + type + ", description=" + description + "]";
		}
	    

}
