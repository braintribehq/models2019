/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Addvariablevalueaction of the Data Model uml.
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

@Description("An AddVariableValueAction is a WriteVariableAction for adding values to a Variable.<p>From package UML::Actions.</p>")

public interface Addvariablevalueaction extends GenericEntity, uml.Writevariableaction {

	EntityType<Addvariablevalueaction> T = EntityTypes.T(Addvariablevalueaction.class);

	/* Constants for each property name. */
	java.lang.String insertAt = "insertAt";
	java.lang.String isReplaceAll = "isReplaceAll";

	@Description("The InputPin that gives the position at which to insert a new value or move an existing value in ordered Variables. The type of the insertAt InputPin is UnlimitedNatural, but the value cannot be zero. It is omitted for unordered Variables.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getInsertAt();
	void setInsertAt(uml.Inputpin insertAt);
	@Description("Specifies whether existing values of the Variable should be removed before adding the new value.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsReplaceAll();
	void setIsReplaceAll(types.Boolean isReplaceAll);
}
