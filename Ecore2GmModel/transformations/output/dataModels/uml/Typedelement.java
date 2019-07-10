/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Typedelement of the Data Model uml.
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
{@link type}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link setType},
 */

@Description("A TypedElement is a NamedElement that may have a Type specified for it.<p>From package UML::CommonStructure.</p>")
 
@Abstract 

public interface Typedelement extends GenericEntity, uml.Namedelement {

	EntityType<Typedelement> T = EntityTypes.T(Typedelement.class);

	/* Constants for each property name. */
	java.lang.String type = "type";

	@Description("The type of the TypedElement.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Type getType();
	void setType(uml.Type type);
}
