/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcContext of the Data Model iai.
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
{@link LongName}, 
{@link Phase}, 
{@link RepresentationContexts}, 
{@link UnitsInContext}, 
{@link IsDefinedBy}, 
{@link Declares}, 

* It provides of then following operations (getters and setters)
{@link getObjectType},
{@link getLongName},
{@link getPhase},
{@link getRepresentationContexts},
{@link getUnitsInContext},
{@link getIsDefinedBy},
{@link getDeclares},
{@link setObjectType},
{@link setLongName},
{@link setPhase},
{@link setRepresentationContexts},
{@link setUnitsInContext},
{@link setIsDefinedBy},
{@link setDeclares},
 */

@Description("")

public interface IfcContext extends GenericEntity, ifc4.IfcObjectDefinition {

	EntityType<IfcContext> T = EntityTypes.T(IfcContext.class);

	/* Constants for each property name. */
	java.lang.String ObjectType = "ObjectType";
	java.lang.String LongName = "LongName";
	java.lang.String Phase = "Phase";
	java.lang.String RepresentationContexts = "RepresentationContexts";
	java.lang.String UnitsInContext = "UnitsInContext";
	java.lang.String IsDefinedBy = "IsDefinedBy";
	java.lang.String Declares = "Declares";

	@Description("")
	@Mandatory
	java.lang.String getObjectType();
	void setObjectType(java.lang.String ObjectType);
	@Description("")
	@Mandatory
	java.lang.String getLongName();
	void setLongName(java.lang.String LongName);
	@Description("")
	@Mandatory
	java.lang.String getPhase();
	void setPhase(java.lang.String Phase);
	@Description("")
	
	java.util.List<ifc4.IfcRepresentationContext> getRepresentationContexts();
	void setRepresentationContexts(java.util.List<ifc4.IfcRepresentationContext> RepresentationContexts);

	@Description("")
	@Mandatory
	ifc4.IfcUnitAssignment getUnitsInContext();
	void setUnitsInContext(ifc4.IfcUnitAssignment UnitsInContext);
	@Description("")
	
	java.util.List<ifc4.IfcRelDefinesByProperties> getIsDefinedBy();
	void setIsDefinedBy(java.util.List<ifc4.IfcRelDefinesByProperties> IsDefinedBy);

	@Description("")
	
	java.util.List<ifc4.IfcRelDeclares> getDeclares();
	void setDeclares(java.util.List<ifc4.IfcRelDeclares> Declares);

}
