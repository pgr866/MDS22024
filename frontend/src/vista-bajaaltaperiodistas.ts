import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-bajaaltaperiodistas')
export class VistaBajaaltaperiodistas extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: space-between;">
 <vaadin-vertical-layout id="Layoutdaraltaperiodista" style="width: 100%; height: 55%; justify-content: space-between;">
  <label id="Labeldaraltaperiodista" style="width: 100%; height: 20%; font-size: 40px; text-align: center; flex-shrink: 0; flex-grow: 0;">Dar de alta periodista</label>
  <vaadin-horizontal-layout id="Nombreydnidaraltaperiodista" style="width: 58%; height: 10%; justify-content: space-between; align-self: center; flex-shrink: 0;">
   <label style="width: 20%; height: 100%; text-align: center; flex-shrink: 0; align-self: center; font-size: 120%;" id="Labelnombredaraltaperiodista">Nombre</label>
   <vaadin-text-field placeholder="Nombre" id="Textfieldnombredaraltaperiodista" style="flex-shrink: 0; align-self: center;"></vaadin-text-field>
   <label style="width: 20%; height: 100%; text-align: center; flex-shrink: 0; font-size: 120%;" id="Labeldnidaraltaperiodista">DNI</label>
   <vaadin-text-field placeholder="DNI" id="Textfielddnidaraltaperiodista" style="flex-shrink: 0; align-self: center;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 58%; height: 10%; justify-content: space-between; align-self: center; flex-shrink: 0;" id="Apellidosemaildaraltaperiodista">
   <label style="width: 20%; height: 100%; text-align: center; flex-shrink: 0; font-size: 120%;" id="Labelapellidosdaraltaperiodista">Apellidos</label>
   <vaadin-text-field placeholder="Apellidos" style="flex-shrink: 0; align-self: center;" id="Textfieldapellidosdaraltaperiodista"></vaadin-text-field>
   <label style="width: 20%; height: 100%; text-align: center; flex-shrink: 0; font-size: 120%;" id="Labelemaildaraltaperiodista">Email</label>
   <vaadin-text-field placeholder="Email" style="flex-shrink: 0; align-self: center;" id="Textfieldemaildaraltaperiodista"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 58%; height: 10%; justify-content: space-between; align-self: center; flex-shrink: 0;" id="Nicktelefonodaraltaperiodista">
   <label style="width: 20%; height: 100%; text-align: center; flex-shrink: 0; font-size: 120%;" id="Labelnickdaraltaperiodista">Nick</label>
   <vaadin-text-field placeholder="Nick" style="flex-shrink: 0; align-self: center;" id="Textfieldnickdaraltaperiodista"></vaadin-text-field>
   <label style="width: 20%; height: 100%; text-align: center; flex-shrink: 0; font-size: 120%;" id="Labeltelefonodaraltaperiodista">Telefono</label>
   <vaadin-text-field placeholder="Telefono" style="flex-shrink: 0; align-self: center;" id="Textfieldtelefonodaraltaperiodista"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 58%; height: 10%; justify-content: space-between; align-self: center; flex-shrink: 0;" id="contrasenafehcanacimientodaraltaperiodista">
   <label style="width: 20%; height: 100%; text-align: center; flex-shrink: 0; font-size: 120%;" id="Labelcontrasenadaraltaperiodista">Contraseña</label>
   <vaadin-text-field placeholder="Contraseña" style="flex-shrink: 0; align-self: center;" id="Textfieldcontrasenadaraltaperiodista"></vaadin-text-field>
   <label style="width: 20%; height: 100%; text-align: center; flex-shrink: 0; font-size: 110%;" id="Labelfechanacimientodaraltaperiodista">Fecha nacimiento</label>
   <vaadin-text-field placeholder="Fecha nacimiento" style="flex-shrink: 0; align-self: center;" id="Textfieldfechanacimientodaraltaperiodista"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 30%; height: 10%; justify-content: space-between; flex-shrink: 0; align-self: center;" id="Layoutbotondaraltaperiodista">
   <vaadin-button style="width: 100%; height: 100%; flex-shrink: 0; align-self: center;" id="Buttondaraltaperiodista">
     Dar de alta 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; height: 40%; flex-shrink: 0; justify-content: space-between;" id="Layoutdarbajaperiodista">
  <label style="width: 100%; height: 30%; font-size: 40px; text-align: center; flex-shrink: 0; flex-grow: 0;" id="Labeldarbajaperiodista">Dar de baja periodista</label>
  <vaadin-horizontal-layout style="width: 40%; height: 70%; align-self: center; justify-content: center;">
   <vaadin-vertical-layout id="Layoutbuscarperiodistabajaaltaperiodistas" style="flex-shrink: 0; justify-content: center; width: 40%;"></vaadin-vertical-layout>
   <vaadin-vertical-layout id="Layoutvistadarbajaperiodista" style="width: 40%; height: 20%; justify-content: space-between; align-self: center; flex-shrink: 0;">
    <vaadin-button id="Buttondarbajaperiodista" style="flex-shrink: 0; width: 100%; height: 100%; align-self: center;">
      Dar de baja 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}