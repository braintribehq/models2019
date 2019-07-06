/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SemanticMarkupElement of the Data Model iso20022.
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
{@link name}, 
{@link value}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getValue},
{@link setName},
{@link setValue},
 */

@Description("A semantic mark-up element defines a name + value pair for content. E.g. for synonyms, the name will be either 'name' or 'context' and the value will be the corresponding synonym name or context.")

public interface SemanticMarkupElement extends GenericEntity, iso20022.ModelEntity {

	EntityType<SemanticMarkupElement> T = EntityTypes.T(SemanticMarkupElement.class);

	/* Constants for each property name. */
	java.lang.String name = "name";
	java.lang.String value = "value";

	@Description("Name of the semantic mark-up element.")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String name);
	@Description("Value of the semantic mark-up element.")
	@Mandatory
	java.lang.String getValue();
	void setValue(java.lang.String value);
}
