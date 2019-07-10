/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Structuralfeatureaction of the Data Model uml.
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
{@link object}, 
{@link structuralFeature}, 

* It provides of then following operations (getters and setters)
{@link getObject},
{@link getStructuralFeature},
{@link setObject},
{@link setStructuralFeature},
 */

@Description("StructuralFeatureAction is an abstract class for all Actions that operate on StructuralFeatures.<p>From package UML::Actions.</p>")
 
@Abstract 

public interface Structuralfeatureaction extends GenericEntity, uml.Action {

	EntityType<Structuralfeatureaction> T = EntityTypes.T(Structuralfeatureaction.class);

	/* Constants for each property name. */
	java.lang.String object = "object";
	java.lang.String structuralFeature = "structuralFeature";

	@Description("The InputPin from which the object whose StructuralFeature is to be read or written is obtained.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getObject();
	void setObject(uml.Inputpin object);
	@Description("The StructuralFeature to be read or written.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Structuralfeature getStructuralFeature();
	void setStructuralFeature(uml.Structuralfeature structuralFeature);
}
