/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Removestructuralfeaturevalueaction of the Data Model uml.
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
{@link isRemoveDuplicates}, 
{@link removeAt}, 

* It provides of then following operations (getters and setters)
{@link getIsRemoveDuplicates},
{@link getRemoveAt},
{@link setIsRemoveDuplicates},
{@link setRemoveAt},
 */

@Description("A RemoveStructuralFeatureValueAction is a WriteStructuralFeatureAction that removes values from a StructuralFeature.<p>From package UML::Actions.</p>")

public interface Removestructuralfeaturevalueaction extends GenericEntity, uml.Writestructuralfeatureaction {

	EntityType<Removestructuralfeaturevalueaction> T = EntityTypes.T(Removestructuralfeaturevalueaction.class);

	/* Constants for each property name. */
	java.lang.String isRemoveDuplicates = "isRemoveDuplicates";
	java.lang.String removeAt = "removeAt";

	@Description("Specifies whether to remove duplicates of the value in nonunique StructuralFeatures.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsRemoveDuplicates();
	void setIsRemoveDuplicates(types.Boolean isRemoveDuplicates);
	@Description("An InputPin that provides the position of an existing value to remove in ordered, nonunique structural features. The type of the removeAt InputPin is UnlimitedNatural, but the value cannot be zero or unlimited.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getRemoveAt();
	void setRemoveAt(uml.Inputpin removeAt);
}
