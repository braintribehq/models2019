/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Linkenddestructiondata of the Data Model uml.
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
{@link destroyAt}, 
{@link isDestroyDuplicates}, 

* It provides of then following operations (getters and setters)
{@link getDestroyAt},
{@link getIsDestroyDuplicates},
{@link setDestroyAt},
{@link setIsDestroyDuplicates},
 */

@Description("LinkEndDestructionData is LinkEndData used to provide values for one end of a link to be destroyed by a DestroyLinkAction.<p>From package UML::Actions.</p>")

public interface Linkenddestructiondata extends GenericEntity, uml.Linkenddata {

	EntityType<Linkenddestructiondata> T = EntityTypes.T(Linkenddestructiondata.class);

	/* Constants for each property name. */
	java.lang.String destroyAt = "destroyAt";
	java.lang.String isDestroyDuplicates = "isDestroyDuplicates";

	@Description("The InputPin that provides the position of an existing link to be destroyed in an ordered, nonunique Association end. The type of the destroyAt InputPin is UnlimitedNatural, but the value cannot be zero or unlimited.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getDestroyAt();
	void setDestroyAt(uml.Inputpin destroyAt);
	@Description("Specifies whether to destroy duplicates of the value in nonunique Association ends.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsDestroyDuplicates();
	void setIsDestroyDuplicates(types.Boolean isDestroyDuplicates);
}
