/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Addstructuralfeaturevalueaction of the Data Model uml.
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

@Description("An AddStructuralFeatureValueAction is a WriteStructuralFeatureAction for adding values to a StructuralFeature.<p>From package UML::Actions.</p>")

public interface Addstructuralfeaturevalueaction extends GenericEntity, uml.Writestructuralfeatureaction {

	EntityType<Addstructuralfeaturevalueaction> T = EntityTypes.T(Addstructuralfeaturevalueaction.class);

	/* Constants for each property name. */
	java.lang.String insertAt = "insertAt";
	java.lang.String isReplaceAll = "isReplaceAll";

	@Description("The InputPin that gives the position at which to insert the value in an ordered StructuralFeature. The type of the insertAt InputPin is UnlimitedNatural, but the value cannot be zero. It is omitted for unordered StructuralFeatures.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getInsertAt();
	void setInsertAt(uml.Inputpin insertAt);
	@Description("Specifies whether existing values of the StructuralFeature should be removed before adding the new value.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsReplaceAll();
	void setIsReplaceAll(types.Boolean isReplaceAll);
}
