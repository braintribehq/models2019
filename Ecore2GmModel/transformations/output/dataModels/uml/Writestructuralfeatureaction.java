/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Writestructuralfeatureaction of the Data Model uml.
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
{@link result}, 
{@link value}, 

* It provides of then following operations (getters and setters)
{@link getResult},
{@link getValue},
{@link setResult},
{@link setValue},
 */

@Description("WriteStructuralFeatureAction is an abstract class for StructuralFeatureActions that change StructuralFeature values.<p>From package UML::Actions.</p>")
 
@Abstract 

public interface Writestructuralfeatureaction extends GenericEntity, uml.Structuralfeatureaction {

	EntityType<Writestructuralfeatureaction> T = EntityTypes.T(Writestructuralfeatureaction.class);

	/* Constants for each property name. */
	java.lang.String result = "result";
	java.lang.String value = "value";

	@Description("The OutputPin on which is put the input object as modified by the WriteStructuralFeatureAction.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Outputpin getResult();
	void setResult(uml.Outputpin result);
	@Description("The InputPin that provides the value to be added or removed from the StructuralFeature.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getValue();
	void setValue(uml.Inputpin value);
}
