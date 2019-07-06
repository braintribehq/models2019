/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Encoding of the Data Model iso20022.
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
{@link messageSet}, 
{@link syntax}, 

* It provides of then following operations (getters and setters)
{@link getMessageSet},
{@link getSyntax},
{@link setMessageSet},
{@link setSyntax},
 */

@Description("A particular set of encoding rules for a MessageInstance.")

public interface Encoding extends GenericEntity, iso20022.ModelEntity {

	EntityType<Encoding> T = EntityTypes.T(Encoding.class);

	/* Constants for each property name. */
	java.lang.String messageSet = "messageSet";
	java.lang.String syntax = "syntax";

	@Description("The MessageSets for which this Encoding is a valid ISO 20022 encoding")
	
	java.util.List<iso20022.MessageSet> getMessageSet();
	void setMessageSet(java.util.List<iso20022.MessageSet> messageSet);

	@Description("The source syntax on which an encoding applies")
	@Mandatory
	iso20022.Syntax getSyntax();
	void setSyntax(iso20022.Syntax syntax);
}
