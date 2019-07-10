/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Linkendcreationdata of the Data Model uml.
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
{@link insertAt}, 
{@link isReplaceAll}, 

* It provides of then following operations (getters and setters)
{@link getInsertAt},
{@link getIsReplaceAll},
{@link setInsertAt},
{@link setIsReplaceAll},
 */

@Description("LinkEndCreationData is LinkEndData used to provide values for one end of a link to be created by a CreateLinkAction.<p>From package UML::Actions.</p>")

public interface Linkendcreationdata extends GenericEntity, uml.Linkenddata {

	EntityType<Linkendcreationdata> T = EntityTypes.T(Linkendcreationdata.class);

	/* Constants for each property name. */
	java.lang.String insertAt = "insertAt";
	java.lang.String isReplaceAll = "isReplaceAll";

	@Description("For ordered Association ends, the InputPin that provides the position where the new link should be inserted or where an existing link should be moved to. The type of the insertAt InputPin is UnlimitedNatural, but the input cannot be zero. It is omitted for Association ends that are not ordered.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getInsertAt();
	void setInsertAt(uml.Inputpin insertAt);
	@Description("Specifies whether the existing links emanating from the object on this end should be destroyed before creating a new link.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsReplaceAll();
	void setIsReplaceAll(types.Boolean isReplaceAll);
}
