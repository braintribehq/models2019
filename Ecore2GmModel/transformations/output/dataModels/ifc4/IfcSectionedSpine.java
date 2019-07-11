/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSectionedSpine of the Data Model iai.
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
{@link SpineCurve}, 
{@link CrossSections}, 
{@link CrossSectionPositions}, 
{@link Dim}, 

* It provides of then following operations (getters and setters)
{@link getSpineCurve},
{@link getCrossSections},
{@link getCrossSectionPositions},
{@link getDim},
{@link setSpineCurve},
{@link setCrossSections},
{@link setCrossSectionPositions},
{@link setDim},
 */

@Description("")

public interface IfcSectionedSpine extends GenericEntity, ifc4.IfcGeometricRepresentationItem {

	EntityType<IfcSectionedSpine> T = EntityTypes.T(IfcSectionedSpine.class);

	/* Constants for each property name. */
	java.lang.String SpineCurve = "SpineCurve";
	java.lang.String CrossSections = "CrossSections";
	java.lang.String CrossSectionPositions = "CrossSectionPositions";
	java.lang.String Dim = "Dim";

	@Description("")
	@Mandatory
	ifc4.IfcCompositeCurve getSpineCurve();
	void setSpineCurve(ifc4.IfcCompositeCurve SpineCurve);
	@Description("")
	
	java.util.List<ifc4.IfcProfileDef> getCrossSections();
	void setCrossSections(java.util.List<ifc4.IfcProfileDef> CrossSections);

	@Description("")
	
	java.util.List<ifc4.IfcAxis2Placement3D> getCrossSectionPositions();
	void setCrossSectionPositions(java.util.List<ifc4.IfcAxis2Placement3D> CrossSectionPositions);

	@Description("")
	@Mandatory
	java.lang.Long getDim();
	void setDim(java.lang.Long Dim);
}
