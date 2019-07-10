/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Instancevalue of the Data Model uml.
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
{@link instance}, 

* It provides of then following operations (getters and setters)
{@link getInstance},
{@link setInstance},
 */

@Description("An InstanceValue is a ValueSpecification that identifies an instance.<p>From package UML::Classification.</p>")

public interface Instancevalue extends GenericEntity, uml.Valuespecification {

	EntityType<Instancevalue> T = EntityTypes.T(Instancevalue.class);

	/* Constants for each property name. */
	java.lang.String instance = "instance";

	@Description("The InstanceSpecification that represents the specified value.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Instancespecification getInstance();
	void setInstance(uml.Instancespecification instance);
}
