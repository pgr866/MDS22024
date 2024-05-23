import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-listadonoticiasportadaidentificado_item')
export class VistaListadonoticiasportadaidentificado_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: absolute;">
 <vaadin-horizontal-layout style="width: 100%; flex-shrink: 0; padding-bottom: var(--lumo-space-s);">
  <vaadin-vertical-layout id="Layouttitulolistadonoticiasportadaidentificado" style="width: 100%; flex-shrink: 0; align-self: stretch; flex-direction: row; flex-wrap: wrap;">
   <vaadin-button id="Titulolistadonoticiasportadaidentificado" style="flex-shrink: 0; width: 100%; height: 100%; background-color: #FFFFFF;">
     Título Noticia 
   </vaadin-button>
   <vaadin-vertical-layout style="flex-shrink: 0; width: 100%;">
    <vaadin-vertical-layout id="Layouttitulonoticiaordenarportadaidentificado" style="width: 100%; height: 100%; padding: 0; flex-shrink: 0; position: relative;"></vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="Layoutimagenlistadonoticiasportadaidentificado" style="width: 100%; flex-shrink: 0; flex-direction: column; display: flex; flex-direction: column; justify-content: space-between; flex-grow: 1;">
  <vaadin-button id="Buttonimagenlistadonoticiasportadaidentificado" style="flex-grow: 1; flex-shrink: 0; width: 100%;">
   <img id="Imagenlistadonoticiasportadaidentificado" style="flex-shrink: 0; flex-grow: 0; z-index: -1;" src="https://imagenes.elpais.com/resizer/xb6jt6pm3nPIWdSvk8ikJp_3wCg=/1200x0/cloudfront-eu-central-1.images.arcpublishing.com/prisa/PC672K3NJRDJNGSA7ZEM2M6E6A.jpg">
  </vaadin-button>
  <vaadin-horizontal-layout id="Layoutautorlugarfechalistadonoticiasportadaidentificado" style="width: 100%; flex-shrink: 0; justify-content: space-between; flex-grow: 0;">
   <label style="flex-shrink: 0; width: 30%; height: 100%; text-align: center;" id="Labelfechalistadonoticiasportadaidentificado">Fecha</label>
   <label style="flex-shrink: 0; width: 30%; height: 100%; text-align: center;" id="Labelautorlistadonoticiasportadaidentificado">Autor</label>
   <label style="flex-shrink: 0; height: 100%; width: 30%; text-align: center;" id="Labellugarlistadonoticiasportadaidentificado">Lugar</label>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="Layouresumenlistadonoticiasportadaidentificado" style="width: 100%; flex-shrink: 1; padding-top: var(--lumo-space-s); flex-grow: 0; padding-bottom: var(--lumo-space-l);">
  <vaadin-text-area id="Textarearesumenlistadonoticiasportadaidentificado" style="width: 100%; flex-shrink: 0; align-self: stretch; height: 100%;" readonly value="Resumen" has-value></vaadin-text-area>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}