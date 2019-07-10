/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Opaquebehavior of the Data Model uml.
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
{@link body}, 
{@link language}, 

* It provides of then following operations (getters and setters)
{@link getBody},
{@link getLanguage},
{@link setBody},
{@link setLanguage},
 */

@Description("An OpaqueBehavior is a Behavior whose specification is given in a textual language other than UML.<p>From package UML::CommonBehavior.</p>")

public interface Opaquebehavior extends GenericEntity, uml.Behavior {

	EntityType<Opaquebehavior> T = EntityTypes.T(Opaquebehavior.class);

	/* Constants for each property name. */
	java.lang.String body = "body";
	java.lang.String language = "language";

	@Description("Specifies the behavior in one or more languages.<p>From package UML::CommonBehavior.</p>")
	
	java.util.List<types.String> getBody();
	void setBody(java.util.List<types.String> body);

	@Description("Languages the body strings use in the same order as the body strings.<p>From package UML::CommonBehavior.</p>")
	
	java.util.List<types.String> getLanguage();
	void setLanguage(java.util.List<types.String> language);

}
