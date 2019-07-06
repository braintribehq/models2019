/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SemanticMarkup of the Data Model iso20022.
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
{@link elements}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getElements},
{@link setType},
{@link setElements},
 */

@Description("Enables modelers to markup elements of the Repository with semantic metadata. Each semanticMarkup string is a TupleValue. ")

public interface SemanticMarkup extends GenericEntity, iso20022.ModelEntity {

	EntityType<SemanticMarkup> T = EntityTypes.T(SemanticMarkup.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String elements = "elements";

	@Description("The type of semantic mark-up e.g. 'synonym'.")
	@Mandatory
	java.lang.String getType();
	void setType(java.lang.String type);
	@Description("The elements of semantic markup.")
	
	java.util.List<iso20022.SemanticMarkupElement> getElements();
	void setElements(java.util.List<iso20022.SemanticMarkupElement> elements);

}
