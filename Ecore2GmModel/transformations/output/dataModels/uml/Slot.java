/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Slot of the Data Model uml.
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
{@link definingFeature}, 
{@link value}, 
{@link owningInstance}, 

* It provides of then following operations (getters and setters)
{@link getDefiningFeature},
{@link getValue},
{@link getOwningInstance},
{@link setDefiningFeature},
{@link setValue},
{@link setOwningInstance},
 */

@Description("A Slot designates that an entity modeled by an InstanceSpecification has a value or values for a specific StructuralFeature.<p>From package UML::Classification.</p>")

public interface Slot extends GenericEntity, uml.Element {

	EntityType<Slot> T = EntityTypes.T(Slot.class);

	/* Constants for each property name. */
	java.lang.String definingFeature = "definingFeature";
	java.lang.String value = "value";
	java.lang.String owningInstance = "owningInstance";

	@Description("The StructuralFeature that specifies the values that may be held by the Slot.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Structuralfeature getDefiningFeature();
	void setDefiningFeature(uml.Structuralfeature definingFeature);
	@Description("The value or values held by the Slot.<p>From package UML::Classification.</p>")
	
	java.util.List<uml.Valuespecification> getValue();
	void setValue(java.util.List<uml.Valuespecification> value);

	@Description("The InstanceSpecification that owns this Slot.<p>From package UML::Classification.</p>")
	@Mandatory
	uml.Instancespecification getOwningInstance();
	void setOwningInstance(uml.Instancespecification owningInstance);
}
