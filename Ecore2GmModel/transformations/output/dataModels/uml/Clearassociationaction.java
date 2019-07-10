/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Clearassociationaction of the Data Model uml.
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
{@link association}, 
{@link object}, 

* It provides of then following operations (getters and setters)
{@link getAssociation},
{@link getObject},
{@link setAssociation},
{@link setObject},
 */

@Description("A ClearAssociationAction is an Action that destroys all links of an Association in which a particular object participates.<p>From package UML::Actions.</p>")

public interface Clearassociationaction extends GenericEntity, uml.Action {

	EntityType<Clearassociationaction> T = EntityTypes.T(Clearassociationaction.class);

	/* Constants for each property name. */
	java.lang.String association = "association";
	java.lang.String object = "object";

	@Description("The Association to be cleared.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Association getAssociation();
	void setAssociation(uml.Association association);
	@Description("The InputPin that gives the object whose participation in the Association is to be cleared.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getObject();
	void setObject(uml.Inputpin object);
}
