/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcGeometricRepresentationSubContext of the Data Model iai.
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
{@link ParentContext}, 
{@link TargetScale}, 
{@link TargetScaleAsString}, 
{@link TargetView}, 
{@link UserDefinedTargetView}, 

* It provides of then following operations (getters and setters)
{@link getParentContext},
{@link getTargetScale},
{@link getTargetScaleAsString},
{@link getTargetView},
{@link getUserDefinedTargetView},
{@link setParentContext},
{@link setTargetScale},
{@link setTargetScaleAsString},
{@link setTargetView},
{@link setUserDefinedTargetView},
 */

@Description("")

public interface IfcGeometricRepresentationSubContext extends GenericEntity, ifc4.IfcGeometricRepresentationContext {

	EntityType<IfcGeometricRepresentationSubContext> T = EntityTypes.T(IfcGeometricRepresentationSubContext.class);

	/* Constants for each property name. */
	java.lang.String ParentContext = "ParentContext";
	java.lang.String TargetScale = "TargetScale";
	java.lang.String TargetScaleAsString = "TargetScaleAsString";
	java.lang.String TargetView = "TargetView";
	java.lang.String UserDefinedTargetView = "UserDefinedTargetView";

	@Description("")
	@Mandatory
	ifc4.IfcGeometricRepresentationContext getParentContext();
	void setParentContext(ifc4.IfcGeometricRepresentationContext ParentContext);
	@Description("")
	@Mandatory
	java.lang.Double getTargetScale();
	void setTargetScale(java.lang.Double TargetScale);
	@Description("")
	@Mandatory
	java.lang.String getTargetScaleAsString();
	void setTargetScaleAsString(java.lang.String TargetScaleAsString);
	@Description("")
	@Mandatory
	ifc4.IfcGeometricProjectionEnum getTargetView();
	void setTargetView(ifc4.IfcGeometricProjectionEnum TargetView);
	@Description("")
	@Mandatory
	java.lang.String getUserDefinedTargetView();
	void setUserDefinedTargetView(java.lang.String UserDefinedTargetView);
}
