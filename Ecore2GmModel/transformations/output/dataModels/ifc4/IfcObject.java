/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcObject of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link ObjectType}, 
{@link IsDeclaredBy}, 
{@link Declares}, 
{@link IsTypedBy}, 
{@link IsDefinedBy}, 

* It provides of then following operations (getters and setters)
{@link getObjectType},
{@link getIsDeclaredBy},
{@link getDeclares},
{@link getIsTypedBy},
{@link getIsDefinedBy},
{@link setObjectType},
{@link setIsDeclaredBy},
{@link setDeclares},
{@link setIsTypedBy},
{@link setIsDefinedBy},
 */

@Description("")

public interface IfcObject extends GenericEntity, ifc4.IfcObjectDefinition {

	EntityType<IfcObject> T = EntityTypes.T(IfcObject.class);

	/* Constants for each property name. */
	java.lang.String ObjectType = "ObjectType";
	java.lang.String IsDeclaredBy = "IsDeclaredBy";
	java.lang.String Declares = "Declares";
	java.lang.String IsTypedBy = "IsTypedBy";
	java.lang.String IsDefinedBy = "IsDefinedBy";

	@Description("")
	@Mandatory
	java.lang.String getObjectType();
	void setObjectType(java.lang.String ObjectType);
	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelDefinesByObject> getIsDeclaredBy();
	void setIsDeclaredBy(java.util.List<ifc4.IfcRelDefinesByObject> IsDeclaredBy);

	@Description("")
	
	java.util.List<ifc4.IfcRelDefinesByObject> getDeclares();
	void setDeclares(java.util.List<ifc4.IfcRelDefinesByObject> Declares);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelDefinesByType> getIsTypedBy();
	void setIsTypedBy(java.util.List<ifc4.IfcRelDefinesByType> IsTypedBy);

	@Description("")
	
	java.util.List<ifc4.IfcRelDefinesByProperties> getIsDefinedBy();
	void setIsDefinedBy(java.util.List<ifc4.IfcRelDefinesByProperties> IsDefinedBy);

}
