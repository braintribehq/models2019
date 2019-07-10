/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Considerignorefragment of the Data Model uml.
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

@Description("A ConsiderIgnoreFragment is a kind of CombinedFragment that is used for the consider and ignore cases, which require lists of pertinent Messages to be specified.<p>From package UML::Interactions.</p>")

public interface Considerignorefragment extends GenericEntity, uml.Combinedfragment {

	EntityType<Considerignorefragment> T = EntityTypes.T(Considerignorefragment.class);

	/* Constants for each property name. */
	java.lang.String message = "message";

	@Description("The set of messages that apply to this fragment.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Namedelement> getMessage();
	void setMessage(java.util.List<uml.Namedelement> message);

}
