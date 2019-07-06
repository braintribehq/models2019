/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Doclet of the Data Model iso20022.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package iso20022;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link type}, 
{@link content}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getContent},
{@link setType},
{@link setContent},
 */

@Description("A Doclet provides a way of adding categorised documentation to an model entity.")

public interface Doclet extends GenericEntity, iso20022.ModelEntity {

	EntityType<Doclet> T = EntityTypes.T(Doclet.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String content = "content";

	@Description("The type of doclet. The definition of the doclet type is left open so that new doclet types can be easily added without the need for a change to the meta-model.")
	@Mandatory
	java.lang.String getType();
	void setType(java.lang.String type);
	@Description("The content for the documentation.")
	@Mandatory
	java.lang.String getContent();
	void setContent(java.lang.String content);
}
