import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout style="width: 100%; height: 15%;"></vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="Layoutdaraltaperiodista" style="width: 100%; height: 55%;">
  <label id="Labeldaraltaperiodista" style="width: 100%; height: 20%; font-size: 40px; text-align: center; flex-shrink: 0; flex-grow: 0;">Dar de alta periodista</label>
  <vaadin-horizontal-layout id="Nombreydnidaraltaperiodista" style="width: 58%; height: 10%; justify-content: space-between; align-self: center; flex-shrink: 0;">
   <label style="width: 20%; height: 100%; text-align: center; flex-shrink: 0;" id="Labelnombredaraltaperiodista">Nombre</label>
   <vaadin-text-field placeholder="Nombre" id="Textfieldnombredaraltaperiodista" style="flex-shrink: 0;"></vaadin-text-field>
   <label style="width: 20%; height: 100%; text-align: center; flex-shrink: 0;" id="Labeldnidaraltaperiodista">DNI</label>
   <vaadin-text-field placeholder="DNI" id="Textfielddnidaraltaperiodista" style="flex-shrink: 0;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 58%; height: 10%; justify-content: space-between; align-self: center; flex-shrink: 0;">
   <label style="width: 20%; height: 100%; text-align: center; flex-shrink: 0;" id="Labelapellidosdaraltaperiodista1">Apellidos</label>
   <vaadin-text-field placeholder="Apellidos" style="flex-shrink: 0;" id="Textfieldapellidosdaraltaperiodista"></vaadin-text-field>
   <label style="width: 20%; height: 100%; text-align: center; flex-shrink: 0;" id="Labelemaildaraltaperiodista">Email</label>
   <vaadin-text-field placeholder="Email" style="flex-shrink: 0;" id="Textfieldemaildaraltaperiodista"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 58%; height: 10%; justify-content: space-between; align-self: center; flex-shrink: 0;">
   <label style="width: 20%; height: 100%; text-align: center; flex-shrink: 0;" id="Labelnickdaraltaperiodista">Nick</label>
   <vaadin-text-field placeholder="Nick" style="flex-shrink: 0;" id="Textfieldnickdaraltaperiodista"></vaadin-text-field>
   <label style="width: 20%; height: 100%; text-align: center; flex-shrink: 0;" id="Labeltelefonodaraltaperiodista">Telefono</label>
   <vaadin-text-field placeholder="Telefono" style="flex-shrink: 0;" id="Textfieldtelefonodaraltaperiodista"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 40%; height: 10%; justify-content: space-between; align-self: center; flex-shrink: 0;">
   <vaadin-button style="width: 100%;">
     Dar de alta 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 35%;" id="Layoutdarbajaperiodista">
  <label style="width: 100%; height: 20%; font-size: 40px; text-align: center; flex-shrink: 0; flex-grow: 0;" id="Labeldarbajaperiodista">Dar de baja periodista</label>
  <vaadin-horizontal-layout style="width: 100%; height: 70%; align-self: center; justify-content: center;">
   <vaadin-horizontal-layout style="width: 60%; height: 50%; justify-content: space-between; align-self: center; flex-shrink: 0;" id="Darbajaperiodista">
    <vaadin-button id="Buttondarbajaperiodista" style="flex-shrink: 0; width: 30%;">
      Dar de baja 
    </vaadin-button>
   </vaadin-horizontal-layout>
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