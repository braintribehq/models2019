/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Valuepin of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link value}, 

* It provides of then following operations (getters and setters)
{@link getValue},
{@link setValue},
 */

@Description("A ValuePin is an InputPin that provides a value by evaluating a ValueSpecification.<p>From package UML::Actions.</p>")

public interface Valuepin extends GenericEntity, uml.Inputpin {

	EntityType<Valuepin> T = EntityTypes.T(Valuepin.class);

	/* Constants for each property name. */
	java.lang.String value = "value";

	@Description("The ValueSpecification that is evaluated to obtain the value that the ValuePin will provide.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Valuespecification getValue();
	void setValue(uml.Valuespecification value);
}
