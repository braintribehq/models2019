/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Destroyobjectaction of the Data Model uml.
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
{@link isDestroyLinks}, 
{@link isDestroyOwnedObjects}, 
{@link target}, 

* It provides of then following operations (getters and setters)
{@link getIsDestroyLinks},
{@link getIsDestroyOwnedObjects},
{@link getTarget},
{@link setIsDestroyLinks},
{@link setIsDestroyOwnedObjects},
{@link setTarget},
 */

@Description("A DestroyObjectAction is an Action that destroys objects.<p>From package UML::Actions.</p>")

public interface Destroyobjectaction extends GenericEntity, uml.Action {

	EntityType<Destroyobjectaction> T = EntityTypes.T(Destroyobjectaction.class);

	/* Constants for each property name. */
	java.lang.String isDestroyLinks = "isDestroyLinks";
	java.lang.String isDestroyOwnedObjects = "isDestroyOwnedObjects";
	java.lang.String target = "target";

	@Description("Specifies whether links in which the object participates are destroyed along with the object.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsDestroyLinks();
	void setIsDestroyLinks(types.Boolean isDestroyLinks);
	@Description("Specifies whether objects owned by the object (via composition) are destroyed along with the object.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsDestroyOwnedObjects();
	void setIsDestroyOwnedObjects(types.Boolean isDestroyOwnedObjects);
	@Description("The InputPin providing the object to be destroyed.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getTarget();
	void setTarget(uml.Inputpin target);
}
