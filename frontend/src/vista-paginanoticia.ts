import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-paginanoticia')
export class VistaPaginanoticia extends LitElement {
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
 <vaadin-horizontal-layout style="flex-shrink: 0; width: 100%; height: 15%;"></vaadin-horizontal-layout>
 <vaadin-vertical-layout style="width: 100%; flex-shrink: 0; padding-top: var(--lumo-space-s); padding-right: var(--lumo-space-xl); padding-bottom: var(--lumo-space-s); padding-left: var(--lumo-space-xl);">
  <label style="width: 80%; flex-shrink: 0; text-align: center; font-size: 200%; align-self: center;">Título</label>
  <label style="width: 80%; flex-shrink: 0; text-align: center; font-size: 100%; align-self: center;">Temática</label>
  <vaadin-vertical-layout style="width: 100%;">
   <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; flex-direction: column; display: flex; flex-direction: column; justify-content: space-between; flex-grow: 1;">
    <img style="flex-shrink: 1; width: 95%; flex-grow: 0; z-index: -1; align-self: center;" src="https://imagenes.elpais.com/resizer/xb6jt6pm3nPIWdSvk8ikJp_3wCg=/1200x0/cloudfront-eu-central-1.images.arcpublishing.com/prisa/PC672K3NJRDJNGSA7ZEM2M6E6A.jpg">
    <vaadin-horizontal-layout style="width: 95%; flex-shrink: 0; justify-content: space-between; flex-grow: 0; align-self: center; height: 5%;">
     <vaadin-horizontal-layout style="flex-shrink: 0; height: 100%; width: 80%;">
      <vaadin-text-field style="flex-shrink: 0; width: 33%; height: 100%; flex-grow: 0;" readonly value="Fecha" has-value></vaadin-text-field>
      <vaadin-text-field style="flex-shrink: 0; width: 33%; height: 100%;" readonly value="Autor" has-value></vaadin-text-field>
      <vaadin-text-field style="flex-shrink: 0; width: 33%; height: 100%;" readonly value="Lugar" has-value></vaadin-text-field>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout style="flex-shrink: 0; width: 20%; height: 100%; justify-content: space-between;">
      <vaadin-button style="height: 100%; flex-shrink: 0; flex-grow: 0; align-self: center; background-color: #FFFFFF; width: 20%;" id="Megusta">
       <img style="height: 100%; width: 100%;" src="https://cdn-icons-png.flaticon.com/512/126/126473.png">
      </vaadin-button>
      <label style="width: 20%; font-size: 110%; align-self: center; text-align: center; ">N</label>
      <vaadin-button style="height: 100%; flex-shrink: 0; flex-grow: 0; align-self: center; background-color: #FFFFFF; width: 20%;" id="Megusta">
       <img style="height: 100%; width: 100%;" src="https://cdn-icons-png.flaticon.com/512/126/126504.png">
      </vaadin-button>
      <label style="width: 20%; font-size: 110%; align-self: center; text-align: center; ">N</label>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 95%; flex-shrink: 1; padding-top: var(--lumo-space-s); flex-grow: 0; padding-bottom: var(--lumo-space-l); align-self: center;">
    <vaadin-text-area style="width: 100%; flex-shrink: 0; align-self: stretch; height: 100%; flex-grow: 0;" readonly value="Resumen" has-value></vaadin-text-area>
    <vaadin-text-area style="width: 100%; flex-shrink: 0; align-self: stretch; height: 100%;" readonly value="Contenido" has-value></vaadin-text-area>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
