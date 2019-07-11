/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcBSplineSurface of the Data Model iai.
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
{@link UDegree}, 
{@link VDegree}, 
{@link ControlPointsList}, 
{@link SurfaceForm}, 
{@link UClosed}, 
{@link VClosed}, 
{@link SelfIntersect}, 
{@link UUpper}, 
{@link VUpper}, 

* It provides of then following operations (getters and setters)
{@link getUDegree},
{@link getVDegree},
{@link getControlPointsList},
{@link getSurfaceForm},
{@link getUClosed},
{@link getVClosed},
{@link getSelfIntersect},
{@link getUUpper},
{@link getVUpper},
{@link setUDegree},
{@link setVDegree},
{@link setControlPointsList},
{@link setSurfaceForm},
{@link setUClosed},
{@link setVClosed},
{@link setSelfIntersect},
{@link setUUpper},
{@link setVUpper},
 */

@Description("")

public interface IfcBSplineSurface extends GenericEntity, ifc4.IfcBoundedSurface {

	EntityType<IfcBSplineSurface> T = EntityTypes.T(IfcBSplineSurface.class);

	/* Constants for each property name. */
	java.lang.String UDegree = "UDegree";
	java.lang.String VDegree = "VDegree";
	java.lang.String ControlPointsList = "ControlPointsList";
	java.lang.String SurfaceForm = "SurfaceForm";
	java.lang.String UClosed = "UClosed";
	java.lang.String VClosed = "VClosed";
	java.lang.String SelfIntersect = "SelfIntersect";
	java.lang.String UUpper = "UUpper";
	java.lang.String VUpper = "VUpper";

	@Description("")
	@Mandatory
	java.lang.Long getUDegree();
	void setUDegree(java.lang.Long UDegree);
	@Description("")
	@Mandatory
	java.lang.Long getVDegree();
	void setVDegree(java.lang.Long VDegree);
	@Description("")
	
	java.util.List<ifc4.ListOfIfcCartesianPoint> getControlPointsList();
	void setControlPointsList(java.util.List<ifc4.ListOfIfcCartesianPoint> ControlPointsList);

	@Description("")
	@Mandatory
	ifc4.IfcBSplineSurfaceForm getSurfaceForm();
	void setSurfaceForm(ifc4.IfcBSplineSurfaceForm SurfaceForm);
	@Description("")
	@Mandatory
	ifc4.Tristate getUClosed();
	void setUClosed(ifc4.Tristate UClosed);
	@Description("")
	@Mandatory
	ifc4.Tristate getVClosed();
	void setVClosed(ifc4.Tristate VClosed);
	@Description("")
	@Mandatory
	ifc4.Tristate getSelfIntersect();
	void setSelfIntersect(ifc4.Tristate SelfIntersect);
	@Description("")
	@Mandatory
	java.lang.Long getUUpper();
	void setUUpper(java.lang.Long UUpper);
	@Description("")
	@Mandatory
	java.lang.Long getVUpper();
	void setVUpper(java.lang.Long VUpper);
}
