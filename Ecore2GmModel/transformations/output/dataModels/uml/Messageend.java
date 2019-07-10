/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Messageend of the Data Model uml.
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
{@link message}, 

* It provides of then following operations (getters and setters)
{@link getMessage},
{@link setMessage},
 */

@Description("MessageEnd is an abstract specialization of NamedElement that represents what can occur at the end of a Message.<p>From package UML::Interactions.</p>")
 
@Abstract 

public interface Messageend extends GenericEntity, uml.Namedelement {

	EntityType<Messageend> T = EntityTypes.T(Messageend.class);

	/* Constants for each property name. */
	java.lang.String message = "message";

	@Description("References a Message.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Message getMessage();
	void setMessage(uml.Message message);
}
